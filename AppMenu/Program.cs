using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppMenu
{
    class Program
    {
        static void menu()
        {
            Console.WriteLine("----------------------");
            Console.WriteLine("-        MENÙ        -");
            Console.WriteLine("----------------------");
            Console.WriteLine("- 1. Entrar datos    -");
            Console.WriteLine("- 2. Suma            -");
            Console.WriteLine("- 3. Resta           -");
            Console.WriteLine("- 4. Multiplicaciòn  -");
            Console.WriteLine("- 5. Divisiòn        -");
            Console.WriteLine("- 6. Salir           -");
            Console.WriteLine("----------------------");
            Console.WriteLine(" ");
            Console.WriteLine("Escribe la opciòn por favor");
        }

        static int funcionSuma (int val1, int val2)
        {
            int suma = val1 + val2;

            return suma;
        }
        static void Main(string[] args)
        {
            bool salir = false;
            int opcion = 0, val1 = 7, val2 = 5, resultadoSuma = 0, resultadoResta = 0, resultadoMulti = 0, resultadoDivi = 0;
            string strOpcion = "";

            Console.WriteLine("Bienvenido a la calculadora de juniors");
            Console.WriteLine("A continuaciòn veràs el menù");
            Console.WriteLine(" ");
            Console.WriteLine(" ");

            while (salir == false)
            {
                menu();

                strOpcion = Console.ReadLine();

                if (int.TryParse(strOpcion, out opcion))
                {
                    //Console.WriteLine("Es un valor numerico" + opcion);

                    switch (opcion)
                    {
                        case 1:
                            Console.WriteLine("----ENTRADA DE DATOS----");
                            Console.WriteLine(" ");
                            Console.WriteLine("Ingresa el valor 1:");

                            val1 = int.Parse(Console.ReadLine());
                            Console.WriteLine("Ingresa el valor 2:");

                            val2 = int.Parse(Console.ReadLine());

                            Console.WriteLine("------------------------");
                            break;

                        case 2:
                            Console.WriteLine("------SUMA------");
                            Console.WriteLine(" ");

                            int result = funcionSuma(val1, val2);
                            Console.WriteLine($" {val1} màs {val2} da: " + result);

                            Console.WriteLine("---------------");
                            break;

                        case 3:
                            Console.WriteLine("------RESTA------");
                            Console.WriteLine(" ");

                            resultadoResta = val1 - val1;
                            Console.WriteLine($" {val1} menos {val2} da: " + resultadoResta);
                            Console.WriteLine("----------------");
                            break;

                        case 4:
                            Console.WriteLine("-------MULTIPLICACIÒN-------");
                            Console.WriteLine(" ");
                            resultadoMulti = val1 * val1;
                            Console.WriteLine($" {val1} * {val2} da: " + resultadoMulti);
                            Console.WriteLine("----------------------------");
                            break;

                        case 5:
                            Console.WriteLine("------DIVISIÒN------");
                            Console.WriteLine(" ");
                            resultadoDivi = val1 / val1;
                           
                            if (val2 == 0)
                            {
                                Console.WriteLine("No puedes dividir asì.");
                            }
                            else
                            {
                                Console.WriteLine($" {val1} dividido {val2} da: " + resultadoDivi);
                            }
                            Console.WriteLine("-------------------");
                            break;

                        case 6:
                            Console.WriteLine("----BYE----");
                            Console.WriteLine(" ");
                            salir = true;
                            Console.WriteLine("------------");
                            break;

                        default:
                            Console.WriteLine("Ingrese una opciòn real");
                            break;

                    }
                }
                else
                {
                    Console.WriteLine("No es numerico. Intentalo de nuevo :)");
                }
                Console.ReadKey();
                Console.Clear();
}
            }
        }
    }

