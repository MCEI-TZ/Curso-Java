public interface Traductor {
    //* Public and Abstract
    void translate();

    //* methods

    default void startTranslate(){
        System.out.println("Starting translate method");
    }
}

class English implements Traductor{
    @Override
    public void translate() {
        System.out.println("Translated English");
    }
}

class French implements Traductor{
    @Override
    public void translate(){
        System.out.println("Translated French");
    }

    @Override
    public void startTranslate(){
        System.out.println("Starting French translate method");
    }
}

class Testing {
    public static void main(String[] args) {
        Traductor english = new English();
        english.translate();
        english.startTranslate();

        Traductor french = new French();
        french.translate();
        french.startTranslate();
    }
}