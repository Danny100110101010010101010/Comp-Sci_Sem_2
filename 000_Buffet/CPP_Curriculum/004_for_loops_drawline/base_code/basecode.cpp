// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char sym;
	char joe;
	int length;
	int i;
	cout <<"please a symbol";
	cin >> sym;
	cout << "please enter line length";
	cin >> length;
	cout << "Horizontal or Vertical?";
	cin >> joe;
	if(joe == 'h'){
		for( i = 0; i < length; i++)
		cout << sym;
	}
	if(joe == 'v'){
		for( i = 0; i < length; i++)
		cout << sym <<endl;
	}
	
	
}

