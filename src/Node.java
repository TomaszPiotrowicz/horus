public class Node  implements INode{

    private String code;
    private  String  renderer;

    public String getCode() {
        return code;
    }



    public String getRenderer() {
        return renderer;
    }

    @Override
    public String toString() {
        return "Node{" +
                "code='" + code + '\'' +
                ", renderer='" + renderer + '\'' +
                '}';
    }

    public Node(String code, String renderer) {
        this.code = code;
        this.renderer = renderer;
    }
}






