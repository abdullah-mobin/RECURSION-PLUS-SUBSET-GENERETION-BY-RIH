#include <iostream>
using namespace std;

void print(int height, int currentRow)
{
    if (currentRow > height) 
    {
        return;
    }
    for (int i = 0; i < height - currentRow; i++) 
    {
        cout << " ";
    }
    for (int i = 0; i <  (2*currentRow) - 1; i++) 
    {
        cout << "*";
    }
    cout<< endl;
    print(height, currentRow + 1);
}
    
int main() 
{
    int height;
    cin >> height;
    print(height,1);
    return 0;
}
