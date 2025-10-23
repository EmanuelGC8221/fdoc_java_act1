package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- DECLARACIÓN DE VARIABLES! ---");
        // --- Declaración de variables ---
        int edad = 25;
        System.out.println("Edad: " + edad);

        String nombre = "Emanuel Giraldo Castañeda";
        System.out.println("Nombre: " + nombre);

        double altura = 1.80;
        System.out.println("Altura: " + altura + " metros");

        // --- Identificadores ---

        // TODO: Implementación en main

        // --- Estilos de convención de codificación ---
        // TODO: Implementación en main

        // --- Tipos de datos primitivos ---
        System.out.println("--- Tipos de datos primitivos ---");
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 100000;
        long longVar = 100000L;
        float floatVar = 10.5f;
        double doubleVar = 20.99;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.printf("byte: " + byteVar, "short: " + shortVar, "int: " + intVar, "long: " + longVar,
                "float: " + floatVar, "double: " + doubleVar, "char: " + charVar, "boolean: " + booleanVar);

        int suma = 5 + 3;
        System.out.println("Suma: " + suma);

        booleanVar = (5 > 3);
        System.out.println("5 es mayor que 3?: " + booleanVar);

        // --- Tipos de datos no primitivos ---
        System.out.println("--- Tipos de datos no primitivos ---");
        String saludo = "Feliz navidad!";
        System.out.println(saludo);

        int[] numeros = { 1, 2, 3 };
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        // --- Operadores aritméticos ---
        System.out.println("--- Operadores aritméticos ---");
        int a = 10;
        int b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División entera: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        System.out.println("division decimal: " + ((double) a / b));

        System.out.println("Incremento: " + (++a));
        System.out.println("Decremento: " + (--b));

        // --- Operadores de asignación ---
        System.out.println("--- Operadores de asignación ---");
        int x = 5;
        x += 3;
        System.out.println("x después de x += 3: " + x);
        x -= 2;
        System.out.println("x después de x -= 2: " + x);
        x *= 4;
        System.out.println("x después de x *= 4: " + x);
        x /= 3;
        System.out.println("x después de x /= 3: " + x);
        x %= 3;
        System.out.println("x después de x %= 3: " + x);

        // --- Operadores de comparación ---
        System.out.println("--- Operadores de comparación ---");
        int num1 = 10;
        int num2 = 20;

        // Comparaciones con == y !=
        boolean sonIguales = (num1 == num2);
        boolean sonDiferentes = (num1 != num2);
        System.out.println("num1 == num2? " + sonIguales);
        System.out.println("num1 != num2? " + sonDiferentes);

        // Comparaciones con >, <, >=, <=
        System.out.println("num1 > num2? " + (num1 > num2));
        System.out.println("num1 < num2? " + (num1 < num2));
        System.out.println("num1 >= num2? " + (num1 >= num2));
        System.out.println("num1 <= num2? " + (num1 <= num2));

        // Uso de if para decidir mensajes basados en comparaciones
        if (num1 > num2) {
            System.out.println("num1 es mayor que num2");
        } else if (num1 < num2) {
            System.out.println("num1 es menor que num2");
        } else {
            System.out.println("num1 y num2 son iguales");
        }

        // --- Operadores lógicos ---
        System.out.println("--- Operadores lógicos ---");
        boolean tieneLicencia = true;
        boolean tieneEdadSuficiente = false;

        // Expresiones con && (AND) y || (OR)
        System.out.println("Puede conducir? (AND) " + (tieneLicencia && tieneEdadSuficiente));
        System.out.println("Cumple al menos una condición? (OR) " + (tieneLicencia || tieneEdadSuficiente));

        // Aplicar ! (NOT) para invertir un valor booleano
        boolean permiso = false;
        System.out.println("Valor original: " + permiso);
        System.out.println("Valor invertido (!permiso): " + (!permiso));

        // Combinación de operadores lógicos y paréntesis
        boolean esMayorDeEdad = true;
        boolean tieneDocumento = true;
        boolean tieneDeudas = false;

        // Condición compuesta, debe ser mayor de edad y tener documento, pero no tener
        // deudas
        boolean puedeSolicitarCredito = (esMayorDeEdad && tieneDocumento) && !tieneDeudas;

        System.out.println("Puede solicitar crédito? " + puedeSolicitarCredito);

        // --- If ---

        System.out.println("--- Estructuras de control If ---");
        int numeroA = 15;
        int numeroB = 10;

        // If: mira si una variable es mayor que otra
        if (numeroA > numeroB) {
            System.out.println("numeroA es mayor que numeroB");
        }

        // If-Else imprime mensajes diferentes según se cumpla o no una condición
        int temperatura = 25;
        if (temperatura > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("No hace tanto calor");
        }

        // If-Else If-Else: clasifica un número en tres rangos por asi decirlo
        int puntuacion = 75;
        if (puntuacion < 50) {
            System.out.println("Rango: Bajo");
        } else if (puntuacion <= 80) {
            System.out.println("Rango: Medio");
        } else {
            System.out.println("Rango: Alto");
        }

        // ---Operador Ternario ---
        System.out.println("--- Operador Ternario ---");
        // si una persona es mayor o menor de edad
        int edadd = 17;
        String categoriaEdad = (edadd >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("La persona es: " + categoriaEdad);

        // descuento si la cantidad comprada supera un umbral
        int cantidad = 12;
        double precioUnitario = 10.0;
        double descuento = (cantidad > 10) ? 0.15 : 0.0; // 15% si compra más de 10 unidades
        double total = cantidad * precioUnitario * (1 - descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" + total);

        // si un número es par o impar
        int numero = 7;
        String tipoNumero = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es: " + tipoNumero);

        // --- Switch ---
        System.out.println("--- Estructura de control Switch ---");
        // Convertir un día de la semana (cadena) en su número correspondiente
        String dia = "miércoles"; // Prueba con diferentes casos o valores
        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("Día 1");
                break;
            case "martes":
                System.out.println("Día 2");
                break;
            case "miércoles":
                System.out.println("Día 3");
                break;
            case "jueves":
                System.out.println("Día 4");
                break;
            case "viernes":
                System.out.println("Día 5");
                break;
            case "sábado":
                System.out.println("Día 6");
                break;
            case "domingo":
                System.out.println("Día 7");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }

        // Convertir una calificación numérica en texto
        int calificacion = 4; // Usa valores del 1 al 5
        switch (calificacion) {
            case 1:
                System.out.println("Calificación: Insuficiente");
                break;
            case 2:
                System.out.println("Calificación: Regular");
                break;
            case 3:
                System.out.println("Calificación: Bueno");
                break;
            case 4:
                System.out.println("Calificación: Muy bueno");
                break;
            case 5:
                System.out.println("Calificación: Excelente");
                break;
            default:
                System.out.println("Calificación no válida");
                break;
        }

        // Imprimir la estación del año según un número entero
        int mes = 8; // Usa valores del 1 al 12
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Estación: Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Estación: Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estación: Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Estación: Otoño");
                break;
            default:
                System.out.println("Mes no válido");
                break;
        }

        // --- Otros ejemplos ---
        // Determinar si un número es positivo, negativo o cero
        int numerom = -3;
        if (numerom > 0) {
            System.out.println("El número es positivo");
        } else if (numerom < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Validar una contraseña comparándola con un valor esperado
        String contraseñaIngresada = "Java123";
        String contraseñaEsperada = "Java123";

        if (contraseñaIngresada.equals(contraseñaEsperada)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        // lasificar una calificación en categorías con if-else if-else
        int nota = 85;
        if (nota < 60) {
            System.out.println("Calificación: Insuficiente");
        } else if (nota < 80) {
            System.out.println("Calificación: Aceptable");
        } else if (nota < 90) {
            System.out.println("Calificación: Buena");
        } else {
            System.out.println("Calificación: Excelente");
        }
    }
}