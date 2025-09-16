# Boas Práticas de Design em Java

## 1. Always keep data private
Manter os dados privados é fundamental para preservar a **encapsulação**.  
Mesmo que seja necessário criar métodos de acesso (*getters*) ou de modificação (*setters*), ainda é melhor manter os campos de instância privados.

> **Motivo:** a representação dos dados pode mudar ao longo do tempo, mas a forma como são usados muda com menos frequência. Com os dados privados, alterações internas não afetam os usuários da classe e os bugs são mais fáceis de detectar.

---

## 2. Always initialize data
- O **Java não inicializa variáveis locais** automaticamente.  
- Já os campos de instância de objetos recebem valores padrão, mas **não confie nisso**.  

Sempre inicialize explicitamente todas as variáveis — seja com valores padrão ou no(s) construtor(es).

---

## 3. Don’t use too many basic types in a class
Evite usar muitos **tipos primitivos ou básicos** diretamente.  
Prefira agrupar dados relacionados em outras classes.

**Exemplo ruim:**
```java
private String street;
private String city;
private String state;
private int zip;
```

**Exemplo melhor (refatorado com `Address`):**
```java
private Address address;
```

Assim, fica mais fácil adaptar o código a mudanças (como endereços internacionais).

---

## 4. Not all fields need individual accessors and mutators
Nem todo campo precisa de *getter* e *setter*.  
- Exemplo: um salário pode precisar de acesso.  
- Já a **data de contratação** dificilmente deve mudar.  
- Alguns campos internos (ex.: array de siglas de estados em `Address`) **não devem ser expostos**.

---

## 5. Break up classes that have too many responsibilities
Se uma classe está sobrecarregada, quebre-a em classes menores e mais focadas.  

**Exemplo ruim:**
```java
public class CardDeck { // Bad design
    private int[] value;
    private int[] suit;
    public CardDeck() { ... }
    public void shuffle() { ... }
    public int getTopValue() { ... }
    public int getTopSuit() { ... }
    public void draw() { ... }
}
```

Essa classe mistura responsabilidades: **baralho** e **carta**.

**Exemplo melhor (refatorado):**
```java
public class CardDeck {
    private Card[] cards;
    public CardDeck() { ... }
    public void shuffle() { ... }
    public Card getTop() { ... }
    public void draw() { ... }
}

public class Card {
    private int value;
    private int suit;
    public Card(int aValue, int aSuit) { ... }
    public int getValue() { ... }
    public int getSuit() { ... }
}
```

---

## 6. Make names reflect responsibilities
- **Classes** → use substantivos significativos: `Order`, `RushOrder`, `BillingAddress`.  
- **Métodos** → use convenções:  
  - Acessores → `getSalary`  
  - Mutadores → `setSalary`

Evite nomes genéricos ou enganosos.

---

## 7. Prefer immutable classes
Classes **imutáveis** são mais seguras, especialmente em ambientes **multithread**.  

Exemplo:  
`LocalDate` e outras classes do pacote `java.time` são imutáveis. Métodos como `plusDays` retornam **novos objetos**, ao invés de modificar os existentes.

> **Benefício:** objetos imutáveis podem ser compartilhados livremente entre threads sem riscos de inconsistência.

**Observação:** nem todas as classes devem ser imutáveis.  
Por exemplo, em `Employee`, um método `raiseSalary` não deve criar um novo objeto.

---
