# BufferedReader

## ReaderBufferedReaderReadline

L'obiettivo di questo esercizio è l'utilizzo della classe **BufferedReader**.

Creare la classe `ReaderBufferedReaderReadline` con all'interno il metodo `main()` dove istanzieremo la classe e lanceremo il metodo `run()` con le operazioni di lettura da effettuare.
Questo esercizio non richiede test JUnit.

> **Nota:** Il file `sentences.txt` contiene una frase per ogni riga.

```java
class ReaderBufferedReaderReadline {

    public static void main(String[] args) {}

    private void run() {}
}
```

### Output

Definire il **BufferedReader br** utilizzando il costruttore `BufferedReader(new FileReader())`.
Con il metodo `br.readline()` leggere e stampare tutte le righe del file, senza tenere conto i caratteri di fine linea _**Carriage Return**_ e _**Line Feed**_.

### Consigli

Per verificare la fine del file, testare la linea letta per `null`.

## Files

**sentences.txt**

```txt
INSALATA
SALSICCIA
TORTELLINI
PIZZA
COCA COLA
LASAGNE
BISCOTTI
TIRAMISU
INSALATA RUSSA
```
