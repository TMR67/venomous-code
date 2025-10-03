class Chapter {
    public String chapterTitle;
    public int pageCount;
    public Author author; 

    public Chapter(String chapterTitle, int pageCount, Author author) {
        this.chapterTitle = chapterTitle;
        this.pageCount = pageCount;
        this.author = author;
    }

    public void chapterDetails() {
        System.out.println("Chapter Title: " + chapterTitle);
        System.out.println("Genre of the Author: " + author.genre);
    }
}