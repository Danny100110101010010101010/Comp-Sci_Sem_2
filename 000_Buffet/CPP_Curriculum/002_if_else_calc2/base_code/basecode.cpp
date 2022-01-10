		// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int num1;
	int num2;
	int num3;
	char joe;
	cout<< "Please enter a number";
	cin >> num1;
	cout<< "Please enter a number";
	cin >> num2;
	cout<< "Enter your operation symbol";
	cin >> joe;
	if(joe == '+'){
		cout<<num1 + num2;
	}
	if(joe == '-'){
		cout<<num1 - num2;
	}
	if(joe == '*'){
		cout<<num1 * num2;
	}
	if (joe == '/'){
		cout<<num1 / num2;
	}
		
	
	

}
