package project2.HOS_project2.database;


public class UniversityItem {
    private final String id;
    private final String imagePath;
    private final String header;
    private final String description;
    private final String href;

    public UniversityItem(String id, String imagePath, String header, String description, String href) {
        this.id = id;
        this.imagePath = imagePath;
        this.header = header;
        this.description = description;
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getDescription() {
        return description;
    }

    public String getHeader() {
        return header;
    }

    public String getHref() {
        return href;
    }
}
