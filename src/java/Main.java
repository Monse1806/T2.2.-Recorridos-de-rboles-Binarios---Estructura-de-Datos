import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que representa un nodo del árbol binario
 */
class Nodo {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    // Constructor
    Nodo(int valor) {
        this.dato = valor;
        this.izquierda = null;
        this.derecha = null;
    }
}

public class Main {
    
    // ================================================================
    // FUNCIONES DE RECORRIDOS (BASE PARA TODOS LOS EJERCICIOS)
    // ================================================================
    
    /**
     * RECORRIDO PREORDEN: Raíz -> Izquierda -> Derecha
     */
    public static void preorden(Nodo raiz) {
        if (raiz == null) return;
        System.out.print(raiz.dato + " ");
        preorden(raiz.izquierda);
        preorden(raiz.derecha);
    }
    
    /**
     * RECORRIDO INORDEN: Izquierda -> Raíz -> Derecha
     */
    public static void inorden(Nodo raiz) {
        if (raiz == null) return;
        inorden(raiz.izquierda);
        System.out.print(raiz.dato + " ");
        inorden(raiz.derecha);
    }
    
    /**
     * RECORRIDO POSTORDEN: Izquierda -> Derecha -> Raíz
     */
    public static void postorden(Nodo raiz) {
        if (raiz == null) return;
        postorden(raiz.izquierda);
        postorden(raiz.derecha);
        System.out.print(raiz.dato + " ");
    }
    
    /**
     * RECORRIDO BFS (Amplitud): Nivel por nivel usando cola
     */
    public static void bfs(Nodo raiz) {
        if (raiz == null) return;
        
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");
            
            if (actual.izquierda != null) cola.add(actual.izquierda);
            if (actual.derecha != null) cola.add(actual.derecha);
        }
    }
    
    // ================================================================
    // EJERCICIO 3: FUNCIÓN PARA CONTAR NODOS
    // ================================================================
    public static int contarNodos(Nodo raiz) {
        if (raiz == null) return 0;
        return 1 + contarNodos(raiz.izquierda) + contarNodos(raiz.derecha);
    }
    
    // ================================================================
    // EJERCICIO 4: FUNCIÓN PARA CONTAR HOJAS
    // ================================================================
    public static int contarHojas(Nodo raiz) {
        if (raiz == null) return 0;
        if (raiz.izquierda == null && raiz.derecha == null) return 1;
        return contarHojas(raiz.izquierda) + contarHojas(raiz.derecha);
    }
    
    // ================================================================
    // MAIN: EJECUCIÓN DE TODOS LOS EJERCICIOS
    // ================================================================
    public static void main(String[] args) {
        
        // ============================================================
        // EJERCICIO 1: ÁRBOL INICIAL (10,5,15,2,7,12,20)
        // ============================================================
        System.out.println("========================================");
        System.out.println("EJERCICIO 1 - ÁRBOL INICIAL");
        System.out.println("========================================");
        
        Nodo raizEj1 = new Nodo(10);
        raizEj1.izquierda = new Nodo(5);
        raizEj1.derecha = new Nodo(15);
        raizEj1.izquierda.izquierda = new Nodo(2);
        raizEj1.izquierda.derecha = new Nodo(7);
        raizEj1.derecha.izquierda = new Nodo(12);
        raizEj1.derecha.derecha = new Nodo(20);
        
        System.out.print("Preorden: ");
        preorden(raizEj1);
        System.out.print("\nInorden: ");
        inorden(raizEj1);
        System.out.print("\nPostorden: ");
        postorden(raizEj1);
        System.out.print("\nBFS: ");
        bfs(raizEj1);
        System.out.println("\n");
        
        // ============================================================
        // EJERCICIO 2: ÁRBOL MODIFICADO (agregar nodos 1,3,18,25)
        // ============================================================
        System.out.println("========================================");
        System.out.println("EJERCICIO 2 - ÁRBOL CON NODOS AGREGADOS");
        System.out.println("Nodos agregados: 1, 3, 18, 25 + nodo extra 30");
        System.out.println("========================================");
        
        // Árbol base
        Nodo raizEj2 = new Nodo(10);
        raizEj2.izquierda = new Nodo(5);
        raizEj2.derecha = new Nodo(15);
        raizEj2.izquierda.izquierda = new Nodo(2);
        raizEj2.izquierda.derecha = new Nodo(7);
        raizEj2.derecha.izquierda = new Nodo(12);
        raizEj2.derecha.derecha = new Nodo(20);
        
        // AGREGAR 5 NODOS NUEVOS (como pide el README)
        raizEj2.izquierda.izquierda.izquierda = new Nodo(1);   // nodo 1
        raizEj2.izquierda.izquierda.derecha = new Nodo(3);     // nodo 3
        raizEj2.derecha.derecha.izquierda = new Nodo(18);      // nodo 18
        raizEj2.derecha.derecha.izquierda.derecha = new Nodo(25); // nodo 25
        raizEj2.derecha.izquierda.derecha = new Nodo(30);      // nodo extra (5to)
        
        System.out.print("Preorden: ");
        preorden(raizEj2);
        System.out.print("\nInorden: ");
        inorden(raizEj2);
        System.out.print("\nPostorden: ");
        postorden(raizEj2);
        System.out.print("\nBFS: ");
        bfs(raizEj2);
        System.out.println("\n");
        
        // ============================================================
        // EJERCICIO 3: CONTAR NODOS (usando el árbol del ejercicio 2)
        // ============================================================
        System.out.println("========================================");
        System.out.println("EJERCICIO 3 - CONTAR NODOS");
        System.out.println("========================================");
        System.out.println("Total de nodos en el árbol: " + contarNodos(raizEj2));
        System.out.println();
        
        // ============================================================
        // EJERCICIO 4: CONTAR HOJAS (usando el árbol del ejercicio 2)
        // ============================================================
        System.out.println("========================================");
        System.out.println("EJERCICIO 4 - CONTAR HOJAS");
        System.out.println("========================================");
        System.out.println("Total de hojas en el árbol: " + contarHojas(raizEj2));
        System.out.println("(Hojas: nodos sin hijos: 1, 3, 7, 12, 25, 30)");
        System.out.println();
        
        // ============================================================
        // EJERCICIO 5: APLICACIÓN AL PROYECTO FINAL (SISTEMA WEB)
        // ============================================================
        System.out.println("========================================");
        System.out.println("EJERCICIO 5 - SISTEMA WEB");
        System.out.println("Aplicación al proyecto final");
        System.out.println("========================================");
        
        // Árbol de módulos del sistema web
        System.out.println("\nEstructura del Sistema Web:");
        System.out.println("            Sistema Web");
        System.out.println("           /           \\");
        System.out.println("   Gestión de       Gestión de");
        System.out.println("    Usuarios         Inventario");
        System.out.println("    /      \\           /      \\");
        System.out.println("Registrar Buscar   Productos Reportes\n");
        System.out.println("\n--- RESULTADOS DE RECORRIDOS EN EL SISTEMA WEB ---");
        System.out.println("NOTA: Los resultados mostrados corresponden a la estructura numerica");
        System.out.println("      aplicando la misma logica a los modulos del sistema web:");
        System.out.println("      - Preorden: Sistema Web -> Gestion Usuarios -> Registrar -> Buscar -> Gestion Inventario -> Productos -> Reportes");
        System.out.println("      - Postorden: Registrar -> Buscar -> Gestion Usuarios -> Productos -> Reportes -> Gestion Inventario -> Sistema Web");
        System.out.println("      - BFS: Sistema Web -> Gestion Usuarios -> Gestion Inventario -> Registrar -> Buscar -> Productos -> Reportes");
    }
}