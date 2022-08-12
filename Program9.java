class Program9 {
    public static void main(String[] args) {
        Integer i = new Integer(50);
        int i1 = i;
        System.out.println("Value of Autoboxing the integer: " + i);
        System.out.println("Value of unboxing the integer: " + i1);

        Character gfg = new Character('a');
        char ch = gfg;
        System.out.println("Value of Autoboxing of character: " + ch);
        System.out.println("Value of unboxing of Character: " + gfg);

        Float fh = new Float(2.5897);
        float f = fh;
        System.out.println("Value of Autoboxing of float: " + fh);
        System.out.println("Value of unboxing of float: " + f);

        Boolean b_ref = new Boolean(true);
        Boolean b = b_ref;
        System.out.println("Value of Autoboxing of Boolean: " + b_ref);
        System.out.println("Value of unboxing of Boolean: " + b);

        Long l_ref = new Long(83775252436637L);
        long l = l_ref.longValue();
        System.out.println("Value of Autoboxing of long: " + l_ref);
        System.out.println("Value of unboxing of long: " + l);
        Byte bb = new Byte((byte) 9);
        byte b1 = bb.byteValue();
    }
}