public class UnliCallTextPackage implements UnliCallsTextOffer{

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnli) {
        if (hasUnli) {
            if (telcoName.equalsIgnoreCase("ditto")) {
                return "Ditto - Unlimited calls & texts to all networks";
            } else if (telcoName.equalsIgnoreCase("globe")) {
                return "Globe - Unlimited calls & texts to Globe/TM network only";
            }
        }
        return telcoName + " - No unlimited calls & texts package";
    }

}