package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;

    private static final int notebookCode = 2000;
    private static int numberOfNoteooks = 0;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    @Override
    protected String generateId(){
        numberOfNoteooks++;
        return String.valueOf(notebookCode + numberOfNoteooks);
    }

    @Override
    public String toString(){
        if(isHardCover){
            return super.toString() + "\nPage count: " + this.pageCount + "\nhas hard cover";
        }else{
            return super.toString() + "\nPage count: " + this.pageCount;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }
}
