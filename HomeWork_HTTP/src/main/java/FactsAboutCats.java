public class FactsAboutCats {
    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public String getId(){
        return id;
    }

    public FactsAboutCats setId(){
        this.id = id;
        return this;
    }

    public String getText(){
        return text;
    }

    public FactsAboutCats setText(){
        this.text = text;
        return this;
    }

    public String getType(){
        return type;
    }

    public FactsAboutCats setType(){
        this.type = type;
        return this;
    }

    public String getUser(){
        return user;
    }

    public FactsAboutCats setUser(){
        this.user = user;
        return this;
    }

    public String getUpvotes(){
        return upvotes;
    }

    public FactsAboutCats setUpvotes(){
        this.upvotes = upvotes;
        return this;
    }
}
