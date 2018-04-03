class AlternateFuel {
int getRating() { return 42; }
static int getRating2() { return 43; }
}
class BioDiesel extends AlternateFuel {
public static void main(String[] args) {
new BioDiesel().go();
System.out.print(super.getRating2()); // #1
}
void go() {
System.out.print(super.getRating()); // #2
}
}
