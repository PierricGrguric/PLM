#include "RemoteBuggle.h"

int line = -1;
int studentCode = 1;
void dogHouse();


int main(){
	studentCode = 1;
	brushDown();
	dogHouse();
	brushUp();

	forward(4);

	brushDown();
	dogHouse();
	brushUp();

	forward(2);
	studentCode = 0;
	left();
	studentCode = 1;
	forward(4);

	brushDown();
	dogHouse();
	brushUp();

	forward(2);
	studentCode = 0;
	left();
	studentCode = 1;
	forward(4);

	brushDown();
	dogHouse();
	return 0;
}






#line 1 "MethodsDogHouse"
/* BEGIN TEMPLATE */
/* BEGIN SOLUTION */
void dogHouse() {
	int i;
	for (i=0;i<4;i++) {
		forward(1);
		forward(1);
		left();
	}
}
/* END SOLUTION */
/* END TEMPLATE */



