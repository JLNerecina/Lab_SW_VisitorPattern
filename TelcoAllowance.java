public class TelcoAllowance implements UsagePromo{

    @Override
    public String showAllowance(String telcoName, double price) {
        return telcoName + " offers " + getDataGB(telcoName) + "GB for ₱" + String.format("%.0f", price) + " per month";
    }
    private int getDataGB(String telcoName) {
        return switch (telcoName.toLowerCase()) {
            case "smart" -> 15;
            case "globe" -> 10;
            case "ditto" -> 8;
            default -> 0;
        };
    }
    
}