# import Queue             # Python 2.x
from queue import Queue # Python 3.x

from threading import Thread

def foo(bar, bar2):
    print('hello {0}'.format(bar, bar2))
    return 'foo'

# que = Queue.Queue()      # Python 2.x
que = Queue()           # Python 3.x

t = Thread(target=lambda q, arg1: q.put(foo(arg1)), args=(que, ('world', '!')))
t.start()
t.join()
result = que.get()
print(result)