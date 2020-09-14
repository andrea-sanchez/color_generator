# Hexadecimal Color Generator

## [GET] Random colors

Route: `/api/hex-color/random?nColors={nColors}&seed={seed}`

Parameters:

| Parameter name | Description                                                        | Default value |
|----------------|--------------------------------------------------------------------|---------------|
| nColors        | Quantity of colors                                                 | 1             |
| seed           | Seed for random number generator. This make reproducible responses | 28            |

Response:

```json
{
    "colors": [
        "#bb3830",
        "#a2a412",
        "#ace820"
    ],
    "time": "2020-09-14T09:28:11.495",
    "nColors": 3,
    "seed": 28
}
```