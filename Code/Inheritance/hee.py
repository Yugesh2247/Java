l=[12,15,16,17,19,23]
a=[19,17,15]
l1=[]
for i in l:
    if i in a:
        if i not in l1:
            l1.append(i)
        else:
            continue
l1.sort()
for i in l1:
    print(i,end=',')
    
