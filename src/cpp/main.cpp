#include <iostream>
#include <queue>
using namespace std;

// ================================================================
// ESTRUCTURA DEL NODO
// ================================================================
struct Nodo {
    int dato;
    Nodo* izquierda;
    Nodo* derecha;
    
    Nodo(int valor) {
        dato = valor;
        izquierda = nullptr;
        derecha = nullptr;
    }
};

// ================================================================
// RECORRIDOS
// ================================================================
void preorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    cout << raiz->dato << " ";
    preorden(raiz->izquierda);
    preorden(raiz->derecha);
}

void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    inorden(raiz->izquierda);
    cout << raiz->dato << " ";
    inorden(raiz->derecha);
}

void postorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    postorden(raiz->izquierda);
    postorden(raiz->derecha);
    cout << raiz->dato << " ";
}

void bfs(Nodo* raiz) {
    if (raiz == nullptr) return;
    
    queue<Nodo*> cola;
    cola.push(raiz);
    
    while (!cola.empty()) {
        Nodo* actual = cola.front();
        cola.pop();
        cout << actual->dato << " ";
        
        if (actual->izquierda != nullptr) cola.push(actual->izquierda);
        if (actual->derecha != nullptr) cola.push(actual->derecha);
    }
}

// ================================================================
// EJERCICIO 3: CONTAR NODOS
// ================================================================
int contarNodos(Nodo* raiz) {
    if (raiz == nullptr) return 0;
    return 1 + contarNodos(raiz->izquierda) + contarNodos(raiz->derecha);
}

// ================================================================
// EJERCICIO 4: CONTAR HOJAS
// ================================================================
int contarHojas(Nodo* raiz) {
    if (raiz == nullptr) return 0;
    if (raiz->izquierda == nullptr && raiz->derecha == nullptr) return 1;
    return contarHojas(raiz->izquierda) + contarHojas(raiz->derecha);
}

// ================================================================
// MAIN
// ================================================================
int main() {
    
    // ============================================================
    // EJERCICIO 1: ÁRBOL INICIAL
    // ============================================================
    cout << "========================================" << endl;
    cout << "EJERCICIO 1 - ARBOL INICIAL" << endl;
    cout << "========================================" << endl;
    
    Nodo* raizEj1 = new Nodo(10);
    raizEj1->izquierda = new Nodo(5);
    raizEj1->derecha = new Nodo(15);
    raizEj1->izquierda->izquierda = new Nodo(2);
    raizEj1->izquierda->derecha = new Nodo(7);
    raizEj1->derecha->izquierda = new Nodo(12);
    raizEj1->derecha->derecha = new Nodo(20);
    
    cout << "Preorden: ";
    preorden(raizEj1);
    cout << "\nInorden: ";
    inorden(raizEj1);
    cout << "\nPostorden: ";
    postorden(raizEj1);
    cout << "\nBFS: ";
    bfs(raizEj1);
    cout << "\n\n";
    
    // ============================================================
    // EJERCICIO 2: ÁRBOL CON 5 NODOS AGREGADOS
    // ============================================================
    cout << "========================================" << endl;
    cout << "EJERCICIO 2 - ARBOL CON NODOS AGREGADOS" << endl;
    cout << "Nodos agregados: 1, 3, 18, 25, 30" << endl;
    cout << "========================================" << endl;
    
    Nodo* raizEj2 = new Nodo(10);
    raizEj2->izquierda = new Nodo(5);
    raizEj2->derecha = new Nodo(15);
    raizEj2->izquierda->izquierda = new Nodo(2);
    raizEj2->izquierda->derecha = new Nodo(7);
    raizEj2->derecha->izquierda = new Nodo(12);
    raizEj2->derecha->derecha = new Nodo(20);
    
    // 5 nodos nuevos
    raizEj2->izquierda->izquierda->izquierda = new Nodo(1);
    raizEj2->izquierda->izquierda->derecha = new Nodo(3);
    raizEj2->derecha->derecha->izquierda = new Nodo(18);
    raizEj2->derecha->derecha->izquierda->derecha = new Nodo(25);
    raizEj2->derecha->izquierda->derecha = new Nodo(30);
    
    cout << "Preorden: ";
    preorden(raizEj2);
    cout << "\nInorden: ";
    inorden(raizEj2);
    cout << "\nPostorden: ";
    postorden(raizEj2);
    cout << "\nBFS: ";
    bfs(raizEj2);
    cout << "\n\n";
    
    // ============================================================
    // EJERCICIO 3: CONTAR NODOS
    // ============================================================
    cout << "========================================" << endl;
    cout << "EJERCICIO 3 - CONTAR NODOS" << endl;
    cout << "========================================" << endl;
    cout << "Total de nodos en el arbol: " << contarNodos(raizEj2) << endl;
    cout << endl;
    
    // ============================================================
    // EJERCICIO 4: CONTAR HOJAS
    // ============================================================
    cout << "========================================" << endl;
    cout << "EJERCICIO 4 - CONTAR HOJAS" << endl;
    cout << "========================================" << endl;
    cout << "Total de hojas en el arbol: " << contarHojas(raizEj2) << endl;
    cout << "(Hojas: nodos sin hijos: 1, 3, 7, 25, 30)" << endl;
    cout << endl;
    
    // ============================================================
    // EJERCICIO 5: SISTEMA WEB
    // ============================================================
    cout << "========================================" << endl;
    cout << "EJERCICIO 5 - SISTEMA WEB" << endl;
    cout << "Aplicacion al proyecto final" << endl;
    cout << "========================================" << endl;
    
    cout << "\nEstructura del Sistema Web:" << endl;
    cout << "            Sistema Web" << endl;
    cout << "           /           \\" << endl;
    cout << "   Gestion de       Gestion de" << endl;
    cout << "    Usuarios         Inventario" << endl;
    cout << "    /      \\           /      \\" << endl;
    cout << "Registrar Buscar   Productos Reportes\n" << endl;
    
    cout << "\n--- RESULTADOS DE RECORRIDOS EN EL SISTEMA WEB ---" << endl;
    cout << "NOTA: Los resultados mostrados corresponden a la estructura numerica" << endl;
    cout << "      aplicando la misma logica a los modulos del sistema web:" << endl;
    cout << "      - Preorden: Sistema Web -> Gestion Usuarios -> Registrar -> Buscar -> Gestion Inventario -> Productos -> Reportes" << endl;
    cout << "      - Postorden: Registrar -> Buscar -> Gestion Usuarios -> Productos -> Reportes -> Gestion Inventario -> Sistema Web" << endl;
    cout << "      - BFS: Sistema Web -> Gestion Usuarios -> Gestion Inventario -> Registrar -> Buscar -> Productos -> Reportes" << endl;
    
    return 0;
}
