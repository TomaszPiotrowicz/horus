import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public List<INode> getNodes() {
        return nodes;
    }

    public MyStructure(List<INode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public int count() {
        return findAllNodes().size();
    }

    @Override
    public INode findByCode(String code) {
        return findByCriteria(findAllNodes(),iNode -> iNode.getCode().equals(code));
    }

    @Override
    public INode findByRedender(String redenderer) {
        return findByCriteria(findAllNodes(),iNode -> iNode.getRenderer().equals(redenderer));
    }
    private List<INode>findAllNodes(){
        return findAllNodes(nodes);
    }
    private List<INode>findAllNodes(List<INode>source){
        List<INode>result = new ArrayList<>();
        for (INode node : source){
            result.add(node);
            if (node instanceof ICompositeNode){
                result.addAll(findAllNodes(((ICompositeNode)node).getNodes()));
            }
        }
        return result;
    }
     private INode findByCriteria(List<INode>source, Predicate<INode>criteria){
        return source.stream()
                .filter(criteria)
                .findFirst()
                .orElse(null);
     }

}

