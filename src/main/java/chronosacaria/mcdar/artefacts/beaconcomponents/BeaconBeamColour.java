package chronosacaria.mcdar.artefacts.beaconcomponents;

public class BeaconBeamColour {
    private final short redValue;
    private final short greenValue;
    private final short blueValue;
    private final short innerRedValue;
    private final short innerGreenValue;
    private final short innerBlueValue;

    public BeaconBeamColour(short redValue, short greenValue, short blueValue, short innerRedValue,
                            short innerGreenValue, short innerBlueValue){
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
        this.innerRedValue = innerRedValue;
        this.innerGreenValue = innerGreenValue;
        this.innerBlueValue = innerBlueValue;
    }

    public short getRedValue(){
        return this.redValue;
    }

    public short getGreenValue(){
        return this.greenValue;
    }

    public short getBlueValue(){
        return this.blueValue;
    }

    public short getInnerRedValue(){
        return this.innerRedValue;
    }

    public short getInnerGreenValue(){
        return this.innerGreenValue;
    }

    public short getInnerBlueValue(){
        return this.innerBlueValue;
    }
}
