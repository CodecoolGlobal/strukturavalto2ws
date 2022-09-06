//There is a TurbineGeneratorSystem class.
//it has a method generateElectricity which returns how many units of electricity generated
//it has a int steamIntake parameter.
//from one unit of steam five unit of electricity can be generated
//if input is negative it throws IllegalArgumentException
public class TurbineGeneratorSystem {
    public int generateElectricity(int steamIntake){
        if(steamIntake < 0) throw new IllegalArgumentException("Input should be positive");
        int electricityQuantity = steamIntake * 5;
        return electricityQuantity;
    }
}

