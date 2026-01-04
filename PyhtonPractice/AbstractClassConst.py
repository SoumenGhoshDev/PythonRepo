from abc import ABC, abstractmethod

class Animal(ABC):
    
    def __init__(self, noofLeg):
        self.noofLeg = noofLeg
        
    @abstractmethod
    def makeSound(self):
        pass
        
    def sleep(self):
        print ('Zzz')
        
    def legCount(self):
        print(self.noofLeg)


class Dog(Animal):

    def __init__(self, noofLeg):
        super().__init__(noofLeg)
        
    def makeSound(self):
        print ('Bark!!!')
        
class Duck(Animal):

    def __init__(self, noofLeg):
        super().__init__(noofLeg)
        
    def makeSound(self):
        print ('Pack!!!')
        

dog = Dog(4)
dog.makeSound()
dog.sleep()
dog.legCount()
dog = Duck(2)
dog.makeSound()
dog.sleep()
dog.legCount()
