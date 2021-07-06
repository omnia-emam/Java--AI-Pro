
package streamapi_pyramids;

public class Stream_Pyramid {
    private String pharoah, ancient_name, modern_name, site, material, height;
    
    public Double getHeight() {
        return Double.valueOf(height);
    }
    
    public void setHeight(String height){
        this.height=height;
    }
    
    public String getPharoah() {
        return pharoah;
    }

    public void setPharoah(String pharoah) {
        this.pharoah = pharoah;
    }

    public String getAncient_name() {
        return ancient_name;
    }

    public void setAncient_name(String ancient_name) {
        this.ancient_name = ancient_name;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Stream_Pyramid(String pharoah, String ancient_name, String modern_name, String site, String material, String height) {
        this.pharoah = pharoah;
        this.ancient_name = ancient_name;
        this.modern_name = modern_name;
        this.site = site;
        this.material = material;
        this.height= height;
    }
    
}
