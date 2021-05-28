#Behavioral Design Patterns

In this project presented all behavioral patterns with simple realization. 
These examples are more for visual representation of how they are working.
These examples are small part of all power of patterns. 
Each package represents each pattern.

Patterns menu:

-[Chain of Responsibility](src/main/java/chain_of_responsibility)

-[Command](src/main/java/command)

-[Iterator](src/main/java/iterator)

-[Mediator](src/main/java/mediator)

-[Memento](src/main/java/memento)

-[Observer](src/main/java/observer)

-[State](src/main/java/state)

-[Strategy](src/main/java/strategy)

-[Visitor](src/main/java/visitor)

-[Work examples](docs/images)

Short theoretical information about each behavioral pattern.
Presented on English and Ukraine languages

Chain of Responsibility/Ланцюжок обов’язків
-

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
Upon receiving a request, each handler decides either to process the request 
or to pass it to the next handler in the chain.

___

Ланцюжок обов’язків — це поведінковий патерн проектування,
що дає змогу передавати запити послідовно ланцюжком обробників. 
Кожен наступний обробник вирішує, 
чи може він обробити запит сам і чи варто передавати запит далі ланцюжком.

Command/Команда
-

Command is a behavioral design pattern that turns a request 
into a stand-alone object that contains all information about the request. 
This transformation lets you pass requests as a method arguments, 
delay or queue a request’s execution, and support undoable operations.

___

Команда — це поведінковий патерн проектування, який перетворює запити на об’єкти, 
дозволяючи передавати їх як аргументи під час виклику методів,
ставити запити в чергу, логувати їх, а також підтримувати скасування операцій.

Iterator/Ітератор
-

Iterator is a behavioral design pattern that lets you traverse elements of
a collection without exposing its underlying representation (list, stack, tree, etc.).

___

Ітератор — це поведінковий патерн проектування, 
що дає змогу послідовно обходити елементи складових об’єктів,
не розкриваючи їхньої внутрішньої організації.

Mediator/Посередник
-

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. 
The pattern restricts direct communications between the objects and forces them to collaborate 
only via a mediator object.

___

Посередник — це поведінковий патерн проектування, 
що дає змогу зменшити зв’язаність великої кількості класів між собою, 
завдяки переміщенню цих зв’язків до одного класу-посередника.

Memento/Знімок
-

Memento is a behavioral design pattern that lets you save and restore the previous state 
of an object without revealing the details of its implementation.

___

Знімок — це поведінковий патерн проектування, 
що дає змогу зберігати та відновлювати минулий стан об’єктів, 
не розкриваючи подробиць їхньої реалізації.

Observer/Спостерігач
-

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify 
multiple objects about any events that happen to the object they’re observing.

___

Спостерігач — це поведінковий патерн проектування, який створює механізм підписки, 
що дає змогу одним об’єктам стежити й реагувати на події, які відбуваються в інших об’єктах.

State/Стан
-

State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
It appears as if the object changed its class.

___

Стан — це поведінковий патерн проектування, 
що дає змогу об’єктам змінювати поведінку в залежності від їхнього стану. 
Ззовні створюється враження, ніби змінився клас об’єкта.

Strategy/Стратегія
-

Strategy is a behavioral design pattern that lets you define a family of algorithms, 
put each of them into a separate class, and make their objects interchangeable.

___

Стратегія — це поведінковий патерн проектування, 
який визначає сімейство схожих алгоритмів і розміщує кожен з них у власному класі. 
Після цього алгоритми можна заміняти один на інший прямо під час виконання програми.

Template Method/Шаблонний метод
-

Template Method is a behavioral design pattern that defines the skeleton of 
an algorithm in the superclass but lets subclasses override specific steps of the algorithm 
without changing its structure.

___

Шаблонний метод — це поведінковий патерн проектування, який визначає кістяк алгоритму, 
перекладаючи відповідальність за деякі його кроки на підкласи. 
Патерн дозволяє підкласам перевизначати кроки алгоритму, не змінюючи його загальної структури.

Visitor/Відвідувач
-

Visitor is a behavioral design pattern that lets you separate algorithms 
from the objects on which they operate.

___

Відвідувач — це поведінковий патерн проектування, 
що дає змогу додавати до програми нові операції,
не змінюючи класи об’єктів, над якими ці операції можуть виконуватися.