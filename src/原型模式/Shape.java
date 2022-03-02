package 原型模式;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/28
 * \
 */
abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}