package categoriespack;

import entityclass.Categories;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import sessionbean.CategoriesFacadeLocal;

/**
 * @name CategoriesMB.java
 * @author Le Thi Minh Loan
 */
@Named(value = "categoriesMB")
@RequestScoped
public class CategoriesMB {

    @EJB
    private CategoriesFacadeLocal categoriesFacade;

    private Integer categoryID;
    private String categoryName;
    private String description;
    private byte[] picture;
    private StreamedContent myImage;
    
    public List<Categories> retrieveAll(){
        return categoriesFacade.findAll();
    }
    

    public CategoriesMB(Integer categoryID, String categoryName, String description, byte[] picture) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }

    public CategoriesMB(Integer categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public CategoriesMB() {
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public StreamedContent getMyImage() {
        InputStream inputStream = new ByteArrayInputStream(this.getPicture());
        myImage = new DefaultStreamedContent(inputStream, "image/png");
        return myImage;
    }

    public void setMyImage(StreamedContent myImage) {
        this.myImage = myImage;
    }
    

}
