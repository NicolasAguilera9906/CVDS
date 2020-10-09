
# **Carlos Andrés Ramírez Torres**
> _“Si he visto más lejos es porque estoy sentado sobre los hombros de gigantes”._
### Datos basícos:
* Estudiante de ingenieria de sistemas en la [Escuela Colombiana de Ingenieria Julio Garavito](https://www.escuelaing.edu.co/es/)
* Bogota, Colombia
* Correo de contacto: Carlos.ramirez-t@mail.escuelaing.edu
* Actualmente estoy cursando las asignaturas:
    1. Ciclos de Vida del Desarrollo de Software
    2. Fundamentos de inteligencia artificial.
    3. Automatización de Procesos de Negocio
    4. Seguridad y Privacidad de TI
    5. Seminario de Inserción Laboral
    6. Estrategias para la Selección de Soluciones de Software
    

### Intereses:

* Inteligencia artificial


![](https://specials-images.forbesimg.com/imageserve/1138781799/960x0.jpg?fit=scale)

Uno de los temas que me incentivaron a aprender sobre inteligencia artificial han sido los grafos, las buquedas, en el ejemplo a continuación es mi solucion de 9Puzzle de uva, para ver soluciones de diferentes problemas, puedes dirigirte a mi repositorio 
[UvaSolution](https://github.com/CAndresRa/UvaSolution)

```python
import sys
from collections import deque

def bfs(src):
    global dist, path
    dist[src]=0;
    q= deque(); q.append((src,0))
    path[src]=''
    while q:
        u,d = q.popleft()
        for i in range(0,9,3):
            v=u[:i]+u[i+1:i+3]+u[i]+u[i+3:]
            if v not in dist:
                dist[v]=dist[u]+1
                path[v]='H'+str(i//3+1)+path[u]
                q.append((v,dist[v]))
        newU=[]
        for i in range(0,9,3):
            newU.append(list(u[i:i+3]))
        for j in range(3):
            tmpU=[[],[],[]]
            for h in range(3):
                for k in range(3):
                    tmpU[h].append(newU[h][k])        
            tmpU[0][j],tmpU[2][j]=tmpU[2][j],tmpU[0][j]
            tmpU[1][j],tmpU[2][j]=tmpU[2][j],tmpU[1][j]
            v=''
            for x in range(3):
                v+=''.join(tmpU[x])
            if v not in dist:
                dist[v]=dist[u]+1
                path[v]='V'+str(j+1)+path[u]
                q.append((v,dist[v]))
        
def main():
    global dist, path
    dist=dict(); path=dict()
    bfs('123456789')
    l=[int(x)for x in sys.stdin.readline().strip().split()]
    while l[0]:
        tgt=''.join(str(x)for x in l)
        for i in range(2):
            l=[int(x)for x in sys.stdin.readline().strip().split()]
            tgt+=''.join(str(x)for x in l)
        if tgt not in dist:
            print('Not solvable')
        else:
            print(dist[tgt],path[tgt])
        l=[int(x)for x in sys.stdin.readline().strip().split()]
main()
```

# Solución Learn Git Branching 

Nombre: Carlos Andrés Ramírez Torres\
Carné:  2128526

## Main
![](https://github.com/CAndresRa/Laboratorio1-CVDS/blob/master/Andres%20Ramirez/uno.png)

## Remote
![](https://github.com/CAndresRa/Laboratorio1-CVDS/blob/master/Andres%20Ramirez/dos.png)
