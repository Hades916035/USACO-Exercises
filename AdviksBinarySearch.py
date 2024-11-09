def binary(x):
    arr=[1,2,3,4,5,6,7,8,9,10]
    rpar=len(arr)-1
    lpar=0
    ind=0
    found=False
    while found==False:
        if arr[(rpar+lpar)//2]>x:
            lpar=(rpar+lpar)//2
        elif arr[(rpar+lpar)//2]<x:
            rpar=(rpar+lpar)//2
        elif arr[(rpar+lpar)//2]==x:
            ind=((rpar+lpar)//2)
            print(ind)
            return ind

binary(7)