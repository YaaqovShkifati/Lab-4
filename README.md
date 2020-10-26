Description: The proupose of this lab, was to generate a sound track list of last quater top songs for a music recod company. The report must be each week top 200 songs in the U.S for one fiscal quarter in ascending order.

Instruction The way we obtain this report goes as following:

Frist we created a class called VipClient that would read each weekly top songs file and store it into 12 different sorted queue linked data structures. Within the VipClient class we created a class called LinkQueue that the consturctor would read each file at a time and store into a queue. The LinkQueue class extends the link class which is exteison of the Linked list class. 

Second we write the Linked Link class which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. Then we write the Link class that repersents the queue linked list: a Queue data structure, we maintain two pointers, front and rear. The front points the first item of queue and rear points to last item. Where each file will have a sperate queue.

Finally we write a method called merge that would merge all the queues into one queue and we print the data into a text file name "VipList.Txt". 

