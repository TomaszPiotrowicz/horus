import java.util.List;

class CompositeNode extends Node implements ICompositeNode {
    private List<INode> nodes;

    public CompositeNode(String code, String renderer, List<INode> nodes) {
        super(code, renderer);
        this.nodes = nodes;
    }


    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        return "CompositeNode{" +
                "nodes=" + nodes +
                '}';
    }
}
