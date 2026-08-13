//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Persona per1 = new Persona();
    Persona per2 = new Persona("28148031-6","Juan", 22, true);
        per1.setRut("25715307-8");
        per1.setNom("Pamela");
        per1.setEdad(40);
        System.out.println(per1.toString());
        System.out.println(per2.toString());

}
