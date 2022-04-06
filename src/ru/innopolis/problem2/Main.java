public class Main {
    public static void main(String[] args) {
        ChargerStation station = new ChargerStation();
        iPhone iPhone = new iPhone();
        station.chargeByLightning(iPhone);
        Android android = new Android();
        LightningAdapter adapter = new LightningAdapter(android);
        station.chargeByLightning(adapter);
    }
}

class ChargerStation {
    public void chargeByLightning(LightningPort phone) {
        phone.chargeByLightning();
    }
}

interface LightningPort {
    void chargeByLightning();
}

interface UsbPort {
    void chargeByUsb();
}

class LightningAdapter implements LightningPort {
    private Android phone;

    public LightningAdapter(Android phone) {
        this.phone = phone;
    }

    public void chargeByLightning() {
        phone.chargeByUsb();
    }
}

class iPhone implements LightningPort {
    public void chargeByLightning() {
    }
}

class Android implements UsbPort {
    public void chargeByUsb() {
    }
}