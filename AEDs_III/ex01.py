def bigger(lista):
    size = len(lista)

    #print(size)
    
    maxRN = totalMax = lista[0]
    
    for i in range(1, size):   
        if maxRN < 0:
            maxRN = 0
        maxRN = max(lista[i], maxRN  + lista[i])
        totalMax = max(totalMax, maxRN)
    
    return totalMax

lista = [2, -4, 6]
print("Largest sum: ", bigger(lista))
