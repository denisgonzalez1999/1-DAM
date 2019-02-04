#include <cstdlib>
#include <iostream>
#include <stdio.h>

using namespace std;


int main(int argc, char** argv) {

    char a[27];
    int i; 
    
    
    for(int i=0; i<26; i++) 
    {
        a[i]=i+45;
        
    }
    
    cout<<a;
    a[26]=0;
    return 0;
}

