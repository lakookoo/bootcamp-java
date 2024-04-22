public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear){
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public Magazine(Magazine source) {
        setTitle(source.getTitle());
        setPublisher(source.getPublisher());
        setIssueNumber(source.getIssueNumber());
        setPublicationYear(source.getPublicationYear());
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        if (publisher == null || publisher.isBlank()){
            throw new IllegalArgumentException("Publisher cannot be null or blank");
        }
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber){
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("issue number cannot be equal zero or negative");
        }
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        if (publicationYear <= 0) {
            throw new IllegalArgumentException("PublicationYear cannot be equal zero or negative");
        }
    }
}
