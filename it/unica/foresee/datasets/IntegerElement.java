package it.unica.foresee.datasets;

import it.unica.foresee.datasets.interfaces.NumberElement;

/**
 * Wrapper for integers as datasets elements.
 */
public class IntegerElement extends DatasetElement<Integer> implements NumberElement<Integer>
{

    /**
     * Constructor from an Integer.
     * @param i the element
     */
    public IntegerElement(Integer i)
    {
        this.setElement(i);
    }

    /**
     * Constructor from a DatasetElement of type Integer.
     * @param d the element
     */
    public IntegerElement(DatasetElement<Integer> d)
    {
        super(d.getElement(), d.getDoubleValue());
    }

    @Override
    /**
     * {@inheritDoc}
     */
    public double getDoubleValue()
    {
        return (double) this.getElement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        return Integer.toString(this.getElement());
    }
}
