#include <iostream>

using namespace std;

struct Node {
    int data;
    struct Node *next;
    Node (int n) {
        data=n;
        next=NULL;
    }
};

struct Node *head=NULL;

void create(int n) {
    head=new Node(n);
}

void addFront(int n ) {
    if(head==NULL)     {
        create(n);
        return;
    }

    struct Node *newNode=new Node(n);
    newNode->next = head;
    head = newNode;
}

void display(struct Node *t) {
    if(t==NULL) {
        cout << "EMPTY" << endl;
        return;
    }

    while(t != NULL) {
        cout << t->data << " ";
        t=t->next;
    }
    cout << endl;
}

void reverse() {
  struct Node *t = head;
  head = head -> next;
  t->next = NULL;
  struct Node *t1;
  
  
  while (head !=NULL ){
    t1=head->next;
    head->next=t;
    t=head;
    head = t1;
  }
  head = t; 
}

int main() {
    display(head);
    addFront(4);
    addFront(3);
    addFront(2);
    addFront(1);
    reverse();
    display(head);

    return 0;
}
