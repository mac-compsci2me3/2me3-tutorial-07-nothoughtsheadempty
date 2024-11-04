import java.util.*;
public class ArticleIterator implements iterator{
    private int index;
    public List<ArticleComponent> c;

    public ArticleIterator(List<ArticleComponent> components) {
        this.index = 0;
        this.c = components;

    }

    @Override
    public boolean hasNext(){
        return index < c.size();
    }

    public ArticleComponent next(){
        return c.get(index++);
    }

    /*
    @Override
    public
    while (ArtIterator.hasNext){
        System.out.println(ArtIterator.next());
    }*/
}
