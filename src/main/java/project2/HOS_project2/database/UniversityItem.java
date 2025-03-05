package project2.HOS_project2.database;


public class UniversityItem {
    private final String id;
    private final String imagePath;
    private final String header;
    private final String description;

    public UniversityItem(String id, String imagePath, String header, String description) {
        this.id = id;
        this.imagePath = imagePath;
        this.header = header;
        this.description = description;
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
}
