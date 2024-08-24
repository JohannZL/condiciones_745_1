import java.util.Scanner;

class Condiciones
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        String name;
        int dia,mes,edad,year,naci,mes_ac;
        System.out.println("ingrese su nombre: ");
        name = leer.next();
        System.out.println(name+ " Ingrese su año de nacimiento: ");
        naci = leer.nextInt();
        System.out.println(name+ " Ingrese su mes de nacimiento: ");
        mes=leer.nextInt();
        System.out.println(name+ " Ingrese su dia de nacimineto: ");
        dia=leer.nextInt();
        year=2024;
        mes_ac=8;
        edad=year-naci;
        if(mes_ac-mes<0)
        {
            edad=edad-1;
            System.out.println(name+" su edead es: "+edad);
        }else
        {
            System.out.println(name+ " su edad es: "+edad);
        }
        if(mes==3 )
        {
            if(dia<=20)
            {
                System.out.println(name+ " su signo del zodiaco es Picis");
            } else
            {
                if(dia>=21)
                {
                    System.out.println(name+ " su signo del zodiaco es Aries");
                }
            }
        }
        if(mes==4 )
        {
            if(dia<=19)
            {
                System.out.println(name+ " su signo del zodiaco es Aries");
            } else
            {
                if(dia>=20)
                {
                    System.out.println(name+ " su signo del zodiaco es Tauro");
                }
            }
        }
        if(mes==5 )
        {
            if(dia<=20)
            {
                System.out.println(name+ " su signo del zodiaco es Tauro");
            } else
            {
                if(dia>=21)
                {
                    System.out.println(name+ " su signo del zodiaco es Géminis");
                }
            }
        }
        if(mes==6 )
        {
            if(dia<=20)
            {
                System.out.println(name+ " su signo del zodiaco es Geminis");
            } else
            {
                if(dia>=21)
                {
                    System.out.println(name+ " su signo del zodiaco es Cancer");
                }
            }
        }
        if(mes==7 )
        {
            if(dia<=22)
            {
                System.out.println(name+ " su signo del zodiaco es Cancer");
            } else
            {
                if(dia>=23)
                {
                    System.out.println(name+ " su signo del zodiaco es Leo");
                }
            }
        }
        if(mes==8 )
        {
            if(dia<=22)
            {
                System.out.println(name+ " su signo del zodiaco es Leo");
            } else
            {
                if(dia>=23)
                {
                    System.out.println(name+ " su signo del zodiaco es Virgo");
                }
            }
        }
        if(mes==9 )
        {
            if(dia<=22)
            {
                System.out.println(name+ " su signo del zodiaco es Virgo");
            } else
            {
                if(dia>=23)
                {
                    System.out.println(name+ " su signo del zodiaco es Libra");
                }
            }
        }
        if(mes==10)
        {
            if(dia<=22)
            {
                System.out.println(name+ " su signo del zodiaco es libra");
            } else
            {
                if(dia>=23)
                {
                    System.out.println(name+ " su signo del zodiaco es Escorpio");
                }
            }
        }
        if(mes==11)
        {
            if(dia<=21)
            {
                System.out.println(name+ " su signo del zodiaco es Escorpio");
            } else
            {
                if(dia>=22)
                {
                    System.out.println(name+ " su signo del zodiaco es Sagitario");
                }
            }
        }
        if(mes==12 )
        {
            if(dia<=21)
            {
                System.out.println(name+ " su signo del zodiaco es Sagitario");
            } else
            {
                if(dia>=22)
                {
                    System.out.println(name+ " su signo del zodiaco es Capriconrnio");
                }
            }
        }
        if(mes==1)
        {
            if(dia<=19)
            {
                System.out.println(name+ " su signo del zodiaco es Capricornio");
            } else
            {
                if(dia>=20)
                {
                    System.out.println(name+ " su signo del zodiaco es Acuario");
                }
            }
        }
        if(mes==2)
        {
            if(dia<=18)
            {
                System.out.println(name+ " su signo del zodiaco es Acuario");
            } else
            {
                if(dia>=19)
                {
                    System.out.println(name+ " su signo del zodiaco es Picis");
                }
            }
        }
    }
}
