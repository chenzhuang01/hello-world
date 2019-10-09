public class ComplexNumber implements Cloneable {
    private double realPart;  //������ʵ��
    private double imaginaryPart;  //�������鲿

    public ComplexNumber() {  //Ĭ�Ϲ��캯��
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public ComplexNumber(double a, double b) {  //���ع��캯��
        this.realPart = a;
        this.imaginaryPart = b;
    }

    /**
     * �����ļӷ����� c = a + b�����㷨���ǣ�
     * c.ʵ�� = a.ʵ�� + b.ʵ��
     * c.�鲿 = a.�鲿 + b.�鲿
     */
    public ComplexNumber add(ComplexNumber aComNum) {
        if (aComNum == null) {
            System.err.println("�����ܹ�Ϊnull��");
            return new ComplexNumber();
        }
        return new ComplexNumber(this.realPart + aComNum.getRealPart(), this.imaginaryPart + aComNum.getImaginaryPart());
    }

    /**
     * �����ļ������� c = a - b�����㷨���ǣ�
     * c.ʵ�� = a.ʵ�� - b.ʵ��
     * c.�鲿 = a.�鲿 - b.�鲿
     */
    public ComplexNumber decrease(ComplexNumber aComNum) {
        if (aComNum == null) {
            System.err.println("�����ܹ�Ϊnull��");
            return new ComplexNumber();
        }
        return new ComplexNumber(this.realPart - aComNum.getRealPart(), this.imaginaryPart - aComNum.getImaginaryPart());
    }

    /**
     * �����ĳ˷����� c = a * b�����㷨���ǣ�
     * c.ʵ�� = a.ʵ�� * b.ʵ�� - a.�鲿 * b.�鲿
     * c.�鲿 = a.�鲿 * b.ʵ�� + a.ʵ�� * b.�鲿
     */
    public ComplexNumber multiply(ComplexNumber aComNum) {
        if (aComNum == null) {
            System.err.println("�����ܹ�Ϊnull��");
            return new ComplexNumber();
        }
        double newReal = this.realPart * aComNum.realPart - this.imaginaryPart * aComNum.imaginaryPart;
        double newImaginary = this.realPart * aComNum.imaginaryPart + this.imaginaryPart * aComNum.realPart;
        ComplexNumber result = new ComplexNumber(newReal, newImaginary);
        return result;
    }

    /**
     * �����ĳ������� c = a / b �����㷨���ǣ�
     * c.ʵ�� = (a.ʵ�� * b.ʵ�� + a.�鲿 * b.�鲿) / (b.ʵ��* b.ʵ�� + b.�鲿 * b.�鲿)
     * c.�鲿 = (a.�鲿 * b.ʵ�� - a.ʵ�� * b.�鲿) / (b.ʵ�� * b.ʵ�� + b.�鲿 * b.�鲿)
     */
    public ComplexNumber divide(ComplexNumber aComNum) {
        if (aComNum == null) {
            System.err.println("�����ܹ�Ϊnull��");
            return new ComplexNumber();
        }
        if ((aComNum.getRealPart() == 0) && (aComNum.getImaginaryPart() == 0)) {
            System.err.println("�������ܹ�Ϊ0��");
            return new ComplexNumber();
        }
        double temp = aComNum.getRealPart() * aComNum.getRealPart() + aComNum.getImaginaryPart() * aComNum.getImaginaryPart();
        double crealpart = (this.realPart * aComNum.getRealPart() + this.imaginaryPart * aComNum.getImaginaryPart()) / temp;
        double cimaginaryPart = (this.imaginaryPart * aComNum.getRealPart() - this.realPart * aComNum.getImaginaryPart()) / temp;
        return new ComplexNumber(crealpart, cimaginaryPart);
    }

    public String toString() {  //��һ��������ʾΪ�ַ���
        return this.realPart + " + " + this.imaginaryPart + "i";
    }

    public boolean equals(Object obj) {  //�Ƚ�һ�������Ƿ��������������ֵ���
        if (obj == null) {
            return false;
        }
        //�����ж�a�ǲ���һ����������instanceof�ؼ����������ж϶��������
        if (obj instanceof ComplexNumber) {
            //���a�Ǹ���������Ҫ����ǿ������ת���ɸ������󣬲��ܵ��ø������ṩ�ķ���
            ComplexNumber b = (ComplexNumber) obj;
            if ((this.realPart == b.getRealPart()) && (this.imaginaryPart == b.getImaginaryPart())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {  //��øø��������hashcode
        /**
         * �����������������equals�ģ���ô���ǵ�hashCodeҲ������ͬ
         * ����ֵ��ȵĸ�������ͨ��toString()�����õ�������ַ�����һ����
         * ���ǣ����԰ѵõ����ַ�����hashCode�������������hashCode
         */
        return this.toString().hashCode();
    }

    public Object clone() {  //�������ж����¡һ���¶���
        /**
         * ���Ҫʹ�Զ�������ܹ���clone,�ͱ���ʵ��Cloneable�ӿڲ�����д����clone()����
         * ���������д��clone������û����������������ʵ��Cloneable�ӿ�
         * ����clone����ʱ�������CloneNotSupportedException�쳣
         */
        try {
            ComplexNumber newObject = (ComplexNumber) super.clone();
            newObject.setRealPart(this.realPart);
            newObject.setImaginaryPart(this.imaginaryPart);
            return newObject;
        } catch (CloneNotSupportedException e) {  //���û��ʵ��Cloneable�ӿڣ��׳��쳣

            e.printStackTrace();
            return null;
        }
    }

    public double getImaginaryPart() {  //�����鲿
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {  //�����鲿
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {  //����ʵ��
        return realPart;
    }

    public void setRealPart(double realPart) {  //����ʵ��
        this.realPart = realPart;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ComplexNumber a = new ComplexNumber(20, 15);
        ComplexNumber b = new ComplexNumber(11, 20);
        System.out.println("ComplexNumber a: " + a.toString());
        System.out.println("ComplexNumber b: " + b.toString());
        System.out.println("(a + b) = " + a.add(b).toString());
        System.out.println("(a - b) = " + a.decrease(b).toString());
        System.out.println("(a * b) = " + a.multiply(b).toString());
        System.out.println("(a / b) = " + a.divide(b).toString());
    }
}
