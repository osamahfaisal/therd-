#**using of keyword const in c++**
 
- Constant is something that doesn't change. In C language and C++ we use the keyword const to make program elements constant. 
const keyword can be used in many contexts in a C++ program , as the following :



1. constant variable  
- If you make any variable as constant ,you can't change its value .Also,the constant variables must be initialized while they are declared
- example : 
```
const int i = 10 ; 
i ++ ;  // this leads to Compile time error 
```
2. pointer with const keyword 
- we can do it in two ways.

a. Pointer to a const variable :This means that the pointer is pointing to a const variable as :
```
const int* u;  // in this case the pointer point to a const variable 
```
b. const pointer : we can't change the pointer, which means it will always point to the variable  but can change the value that it points to, by changing the value of variable as :
```
int x = 1 ;
int *const y =&x ;
```

3. const Function argument and return type:We can make the return type or arguments of a function as const. Then we cannot change any of them as :

```
void function1(const int x ){  // void function with const argument
x=25 //  this leads to Compile time error becouse x is const argument 
}
```

```
const int function(){
return 2 ;  // if we try put variable instead it will give us error
}
```

4.Defining Class Data members as const :They are not initialized during declaration Their initialization by constructor when create object as :
```
class C
{
    const int j;
    public:
    C (int x):j(x)  // initialzed when create a new object 
    };
int main()
{
    Test t(10);
    Test s(20);
}
```

5. Defining Class Object as const : When an object is declared or created using the const keyword, its data members can never be changed, during the object's lifetime 
- For example, if in the class C defined above, we want to define a constant object, we can do it like:
```
const C r(30);
```
6. Defining Class's Member function as const :A const member functions never modifies data members in an object.
- its syntax is 
```
return_type function_name() const;
```
