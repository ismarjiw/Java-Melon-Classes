public class Melon {

    public static void main(String[] args) {
        System.out.println("melon defined");
    }

    MelonType melonType;
    int shapeRating;
    int colorRating;
    int field;
    String harvester;

    public boolean isSellable() {
        return isSellable(this.shapeRating, this.colorRating, this.field);
    }
    
    public static boolean isSellable(Melon melonToTest) {
        return isSellable(melonToTest.shapeRating, melonToTest.colorRating, melonToTest.field);
    }

    public static boolean isSellable(int shapeRating, int colorRating, int field){
        if (shapeRating > 5 && colorRating > 5 && field !=3){
            return true;
        } else {
            return false;
        }
    }

    public MelonType getMelonType() {
        return melonType;
    }

    public void setMelonType(MelonType melonType) {
        this.melonType = melonType;
    }

    public int getShapeRating() {
        return shapeRating;
    }

    public void setShapeRating(int shapeRating) {
        this.shapeRating = shapeRating;
    }

    public int getColorRating() {
        return colorRating;
    }

    public void setColorRating(int colorRating) {
        this.colorRating = colorRating;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public String getHarvester() {
        return harvester;
    }

    public void setHarvester(String harvester) {
        this.harvester = harvester;
    }

    public Melon(MelonType melonType,
            int shapeRating,
            int colorRating,
            int field,
            String harvester) {
        this.melonType = melonType;
        this.shapeRating = shapeRating;
        this.colorRating = colorRating;
        this.field = field;
        this.harvester = harvester;
    }

}
