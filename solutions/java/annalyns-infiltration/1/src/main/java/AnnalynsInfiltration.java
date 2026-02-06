class AnnalynsInfiltration {
    // static boolean knightIsAwake = true;
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");

    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        if(knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        // if(archerIsAwake && prisonerIsAwake)return true;
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");

        if (petDogIsPresent) {
        return !archerIsAwake;
    }

    return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }
}
