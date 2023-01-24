public class Main {

    public static void main(String[] args) {
        MelonType musk = new MelonType(
        "musk",
        "Muskmelon",
        1998,
        "green",
        true,
        true
        );

        MelonType cas = new MelonType(
        "cas",
        "Casaba",
        2003,
        "orange",
        false,
        false
        );

        MelonType cren = new MelonType(
        "cren",
        "Crenshaw",
        1996,
        "green",
        true,
        false
        );

        MelonType yellow = new MelonType(
        "yw",
        "Yellow Watermelon",
        2013,
        "yellow",
        true,
        true
        );

    System.out.println(musk.getCode());
    System.out.println(musk.getColor());
    System.out.println(musk.getFirstHarvest());
    System.out.println(musk.getName());
    System.out.println(musk.isIsBestseller());
    System.out.println(musk.isIsSeedless());


    // technnique 1 
    MelonType[] melonTypes = new MelonType[4];
    melonTypes[0] = musk;
    melonTypes[1] = cas;
    melonTypes[2] = cren;
    melonTypes[3] = yellow;

    Melon melon1 = new Melon(melonTypes[1], 8, 7, 2, "Sheila");
    System.out.println(melonTypes);
    System.out.println(melon1.getMelonType().getCode());
    System.out.println(melon1.getMelonType().getColor());
    System.out.println(Melon.isSellable(1, 1, 3));
    System.out.println(Melon.isSellable(melon1));
    melon1.field=4;
    System.out.println(melon1.isSellable());

    // System.out.println(musk.getColor());
    
    // technique 2 
    // MelonType[] melonTypes = {musk, cas, cren, yellow}; 

    // Melon melon1 = new Melon(melonTypes[0], 8, 7, 2, "Sheila");
    // System.out.println(melonTypes);
    // System.out.println(melon1);
    // System.out.println(melon1.getMelonType());
    // System.out.println(musk);

    // A melon is able to be sold if both its shape and color ratings are greater than 5, and it didn’t come from field 3

    // System.out.println(melon1.isSellable(6, 6, 1));
    }
}