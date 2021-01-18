package drachenbauer32.coloredflowerpotsmod.util;

public enum FlowerPotColors
{
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    LIME("lime"),
    CYAN("cyan"),
    BLUE("blue"),
    PURPLE("purple"),
    MAGENTA("magenta"),
    PINK("pink"),
    LIGHT_BLUE("light_blue"),
    GREEN("green"),
    BROWN("brown"),
    BLACK("black"),
    GRAY("gray"),
    LIGHT_GRAY("light_gray"),
    WHITE("white");
    
    public final String name;
    
    private FlowerPotColors(String name) {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}
