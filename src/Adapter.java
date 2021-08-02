class AcAdapter extends Dengen {
    private JapaneseConsent jc=new JapaneseConsent();

    @Override
    public int kyuuden() {
        return (int)(jc.power()*0.16);
    }
}