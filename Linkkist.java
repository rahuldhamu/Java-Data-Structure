
class node {
  private int info;
  private node next;
  node(int info){
    this.info = info;
    this.next = null;
  }
  
  public int get_info(){
    return this.info;
  }
  public node next(){
    return this.next;
  }
  public void update_info(int new_info){
    this.info = new_info;
  }
  
}
