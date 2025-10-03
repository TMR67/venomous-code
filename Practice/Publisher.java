class Publisher {
    public String publisherName;
    public Author author; 

    public Publisher(String publisherName, Author author) {
        this.publisherName = publisherName;
        this.author = author;
    }

    public void publisherDetails() {
        System.out.println("Publisher: " + publisherName + " | Author is: " + author.authorName);
    }
}