import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    String name;
    int dia,mes,dia_ac=23,mes_ac=8,naci,year=2023,edad;

    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese su nombre: ");
    name = leer.next();
    System.out.println(name+"ingrese su year de nacimiento");
    naci = leer.nextInt();
    System.out.println(name+"Ingrese su mes de nacimiento: ");
    mes = leer.nextInt();
    System.out.println(name+"ingrese se dia de nacimiento: ");
    dia = leer.nextInt();
    edad = year - naci;
    if(mes-mes_ac<0)
    {
      edad--;
	System.out.println(name+"su edad es:"+edad+);
    }
    if(dia>=21 || dia<=19) 
    {
      if(mes>=3 || mes<=4){
	System.out.println(name+"su signo zodiacal es Aries");
	}
    }
	if(dia>=20 || dia<=20){
		if(mes>=4 || mes<=5){
		System.out.println(name+"su signo zodiacal es Tauro");
			}
		}  
}
}
