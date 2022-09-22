Node* rotate(Node* head, int k)
    {
        struct Node *f;
         
        struct Node *l;
        
        struct Node *t;
        
        while (k != 0 ) {
        for(t=head; t->next != NULL; t=t->next);
        f=head;
        // t->next=f;
        t->next=f;
        head=head->next;
        f->next=NULL;
        
        --k;
        }
        return head;
    
    }
